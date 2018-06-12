package Zipper;

class Zipper {

    static String zipString(String toZip) {
        StringBuilder result = new StringBuilder();
        char[] chars = toZip.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                result.append("1").append(chars[i]);
            } else if (i + 1 < chars.length && chars[i + 1] == chars[i]) {
                char base = chars[i];
                int timesChar = 1;
                int nextPos = i + 1;
                while (nextPos < chars.length && chars[nextPos] == base && timesChar < 9) {
                    timesChar++;
                    nextPos++;
                }
                result.append(base).append(timesChar);
                i = nextPos - 1;
            } else {
                result.append(chars[i]);
            }
        }
        return result.toString();
    }

    static String unzipString(String toUnzip) throws IllegalArgumentException {
        if (toUnzip.length() == 0) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        StringBuilder result = new StringBuilder();
        char[] chars = toUnzip.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.toString(chars[i]).equals("1")) {
                result.append(chars[i + 1]);
                i += 1;
            } else if (Character.isDigit(chars[i])) {
                result.deleteCharAt(result.length()-1);
                int timesChar = Character.getNumericValue(chars[i]);
                char base = chars[i - 1];
                for (int t = 0; t < timesChar; t++) {
                    result.append(base);
                }
            } else {
                result.append(chars[i]);
            }
        }
        return result.toString();

    }
}
