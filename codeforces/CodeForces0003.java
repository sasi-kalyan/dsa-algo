public class CodeForces0003 {

    public static int findShort(String s){
        String[] sarr = s.split("\\s");

        int shot = Integer.MAX_VALUE;

        for(int i=0;i<sarr.length;i++){
            shot = Math.min(sarr[i].length(), shot);
        }

        return shot;
    }

    public static void main(String[] args) {

        String s = "bitcoin take over the world maybe who knows perhaps";

        System.out.println(findShort(s));

    }
}
