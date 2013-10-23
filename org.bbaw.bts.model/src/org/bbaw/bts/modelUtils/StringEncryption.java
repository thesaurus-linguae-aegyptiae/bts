package org.bbaw.bts.modelUtils;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bbaw.bts.commons.BTSConstants;

public class StringEncryption
{
	private static final String SECRET = "littleredridinghood";

	public static byte[] encrypt(String key, String value) throws GeneralSecurityException,
			UnsupportedEncodingException
	{
		if (key == null)
		{
			key = SECRET;
		}

		byte[] raw = key.getBytes(BTSConstants.ENCODING);
		if (raw.length != 16)
		{
			throw new IllegalArgumentException("Invalid key size.");
		}

		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, new IvParameterSpec(new byte[16]));
		return cipher.doFinal(value.getBytes(BTSConstants.ENCODING));
	}

	public static String decrypt(String key, byte[] encrypted) throws GeneralSecurityException,
			UnsupportedEncodingException
	{
		if (key == null)
		{
			key = SECRET;
		}
		byte[] raw = key.getBytes(BTSConstants.ENCODING);
		if (raw.length != 16)
		{
			throw new IllegalArgumentException("Invalid key size.");
		}
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, skeySpec, new IvParameterSpec(new byte[16]));
		byte[] original = cipher.doFinal(encrypted);

		return new String(original, BTSConstants.ENCODING);
	}
}