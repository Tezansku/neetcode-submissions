class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> integer = new Stack<>();

        for (int i = 0; i < operations.length; i++){
            
            if (operations[i].equals("+")){
                int last = integer.pop();
                int secondLast = integer.peek();

                integer.push(last);
                integer.push(last + secondLast);
            }
            else if (operations[i].equals("D")){
                int double1 = integer.peek();
                integer.push(double1 * 2);
            }
            else if (operations[i].equals("C")){
                integer.pop(); 

            }
            else {
                integer.push(Integer.parseInt(operations[i]));
            }
        }


        int sum = 0;
        for (int num : integer){
            sum += num;
        }
        return sum;
    }
}