public class Solution {
    public String name ;
    public int roll ;


    public Solution (String name , int roll) {
        this.name = name ;
        this.roll = roll;
    }



    public static void main(String[] args) {
        Solution solution = new Solution("Mohammad Alamin", 122000);
        System.out.println(solution.name + " "+solution.roll);
    }





}