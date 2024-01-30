package com.mbti;

public class MBTI {
	public static String wellcome = "  ███    ███ ██████  ████████ ██ \r\n" + "  ████  ████ ██   ██    ██    ██ \r\n"
			+ "  ██ ████ ██ ██████     ██    ██ \r\n" + "  ██  ██  ██ ██   ██    ██    ██ \r\n"
			+ "  ██      ██ ██████     ██    ██ \r\n" + "                                 \r\n"
			+ "                         " + "" + "" + "" + "        ";

	public static String mod1 = "";
	public static String mod2 = "";
	public static String mod3 = "";
	public static String mod4 = "";

	int M = Sum.sum1;
	int B = Sum.sum2;
	int T = Sum.sum3;
	int I = Sum.sum4;

	public void insert(int sum) {
		if (sum < 2) {
			mod1 = " ####### \r\n" + " ##      \r\n" + " ##      \r\n" + " ####### \r\n" + " ###     \r\n"
					+ " ###     \r\n" + " ####### ";
		} else if (sum > 1) {
			mod1 = " ####### \r\n" + "   ###   \r\n" + "   ###   \r\n" + "   ###   \r\n" + "   ###   \r\n"
					+ "   ###   \r\n" + " #######";

		}
		if (B < 2) {
			mod2 = "";
		}

		else if (B > 1) {
			mod2 = "";
		}

		if (T < 2) {
			mod3 = "";
		} 
		else if (T > 1) {
			mod3 = "";
		}
		if (I < 2) {
			mod4 = "";
		} 
		else if (I > 1) {
			mod4 = "";
		}

	}
}
