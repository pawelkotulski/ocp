package test3.q5;

public class Test {
    enum JobStatus {
        SUCCESS, FAIL; //Line 3
    }

    enum TestResult {
        PASS, FAIL; //Line 7
    }

    public static void main(String[] args) {
        JobStatus js = JobStatus.FAIL;
        TestResult tr = TestResult.FAIL;

        System.out.println(js.equals(tr)); //Line 14

        //this will not compile
        //System.out.println(js == tr); //Line 15
    }
}
