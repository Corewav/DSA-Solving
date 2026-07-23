// Last updated: 7/23/2026, 9:33:34 AM
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            local = local.split("\\+")[0].replace(".", "");
            
            String processedEmail = local + "@" + domain;
            uniqueEmails.add(processedEmail);
        }

        return uniqueEmails.size(); 
    }
}
