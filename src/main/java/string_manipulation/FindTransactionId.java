/*
1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
        Output: TXN123456
*/


package string_manipulation;

public class FindTransactionId {
    public static void main(String[] args) {
        String htmlBody = "<html> + <title> + Test + </title> + <body> + Your trnx is successful. + Trnx Id is: TXN123456 + </body> + </html>";
        int firstIndex = htmlBody.indexOf("TXN");
        //int lastIndex=firstIndex+8;

        String finalWord= htmlBody.substring(firstIndex, firstIndex+9);

        System.out.println("Your Transaction id is: " +finalWord);


 /*       String findIndex= htmlBody.substring(85,94);

        System.out.println("Your Transaction id is: " +findIndex);*/


    }
}

