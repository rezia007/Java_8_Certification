package assertions;

public class AssertionJava03 {
    public static void main(String[] args) {
    }
int z=5;
    public void stuff1(int x){
        assert (x>0);
        switch (x){
            case 2:x=3;
            default:assert false;
        }
    }
    private void stuff2(int y){
        assert (y<0);
    }
    //private void stuff3(){
        //assert (stuff4());}
    //private void stuff4(){
        //z=6;return false;}

}

