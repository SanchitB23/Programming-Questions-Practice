package yash_project;

class HexCodec {
    private static final char[] kDigit = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f'
    };

    public static char[] bytesToHex(byte[] raw) {
        int l = raw.length;
        char[] hex = new char[l * 2];
        for (int i = 0; i < l; i++) {
            int c = (raw[i] + 256) % 256;
            int hiIndex = c >> 4;
            int lwIndex = c & 0x0f;
            hex[i * 2 + 0] = kDigit[hiIndex];
            hex[i * 2 + 1] = kDigit[lwIndex];
        }
        return hex;
    }

    public static byte[] hexToBytes(char[] hex) {
        int l = hex.length / 2;
        byte[] raw = new byte[l];
        for (int i = 0; i < l; i++) {
            int hi = Character.digit(hex[i * 2], 16);
            int lw = Character.digit(hex[i * 2 + 1], 16);
            int value = (hi << 4) | lw;
            if (value > 127) value -= 256;
            raw[i] = (byte) value;
        }
        return raw;
    }

    public static byte[] hexToBytes(String hex) {
        return hexToBytes(hex.toCharArray());
    }
}