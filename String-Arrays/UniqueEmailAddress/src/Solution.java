import java.util.HashSet;

public class Solution {

    /**
     * Given an array of strings emails where we send one email to each (emails)[i], return the number of different addresses that actually receive mails.
     * @param emails - an array of string emails
     * @return number - number of different addresses that actually receive mails
     */
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> emailSet = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String currentEmail = emails[i];
            int splitIndex = currentEmail.indexOf("@");
            String localName = currentEmail.substring(0, splitIndex).replaceAll("\\.","");
            String domainName = currentEmail.substring(splitIndex);

            if (localName.contains("+")) {
                localName = localName.substring(0, localName.indexOf("+"));
            }

            String newEmail = localName.concat(domainName);
            if (!emailSet.contains(newEmail)) {
                emailSet.add(newEmail);
            }
        }
        return emailSet.size();
    }

    public static void main(String[] args) {
        String[] emails1 = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails1));
    }
}