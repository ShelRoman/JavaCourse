package Zipper;

public class ZipRunner {

    public static void main(String[] args) {
        String[] testCases = {"hellowoooorld", "He4lo", "helooooooooo", "helooooooooooo","abc5abc5"};

        for (String case_ : testCases) {
            String zipped = Zipper.zipString(case_);
            System.out.println("Case is " + case_ + " zipped - " + zipped + "; Unzipped - " + Zipper.unzipString(zipped));
        }


    }
}
