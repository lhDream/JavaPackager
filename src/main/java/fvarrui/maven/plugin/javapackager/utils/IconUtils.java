package fvarrui.maven.plugin.javapackager.utils;

import fvarrui.maven.plugin.javapackager.Platform;

public class IconUtils {

	public static String getIconFileExtensionByPlatform(Platform platform) {
		switch (platform) {
		case linux: 	return ".png";
		case mac: 		return ".icns";
		case windows: 	return ".ico";
		default:		return null;
		}
	}
	
}
