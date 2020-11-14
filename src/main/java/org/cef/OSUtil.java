package org.cef;

import com.jogamp.common.os.Platform;

/**
 * Utility to fetch metadata about the currently running operating system
 *
 * @author Fritz Windisch
 */
public class OSUtil {
    /**
     * Fetches the current operating system name
     * @return "linux", "macosx" or "win"
     * @throws RuntimeException When the operating system is unknown or not supported
     */
    public static String getOsName() throws RuntimeException {
        if(OS.isLinux())return "linux";
        else if(OS.isMacintosh())return "macosx";
        else if(OS.isWindows())return "win";
        else throw new RuntimeException("Unknown operating system: "+System.getProperty("os.name"));
    }

    /**
     * Fetches the bitness of the current JVM
     * @return "32" or "64"
     */
    public static String getJvmArch(){
        if(Platform.is64Bit())return "64";
        else return "32";
    }
}
