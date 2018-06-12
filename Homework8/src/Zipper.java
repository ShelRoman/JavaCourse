class Zipper {

    static String zipString(String toZip) {
        StringBuilder result = new StringBuilder();
        for (char c: toZip.toCharArray()) {
            result.append(c);
        }
       return result.toString();
    }

}
