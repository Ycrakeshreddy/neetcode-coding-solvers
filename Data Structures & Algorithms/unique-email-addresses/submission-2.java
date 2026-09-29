class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for(String email : emails) {

            String part[] = email.split("@");

            String local = part[0].split("\\+")[0];

            local = local.replace(".", "");

            String newEmail = local+"@"+part[1];

            set.add(newEmail);




        }

        return set.size();
        
    }
}