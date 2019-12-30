package kv.experiements.algorithms;

public class TowerOfHanoi {

    void findHanoiMoves(int numberOfDisks,char rodFrom,char rodMid,char rodTo ){
        if (numberOfDisks==1){
            System.out.println("* Moving Disk 1 from "+  rodFrom +" to " + rodTo);
            return;
        }
        findHanoiMoves(numberOfDisks-1,rodFrom,rodTo,rodMid);
        System.out.println("Moving Disc " +numberOfDisks + " from "+rodFrom+" to "+rodTo);
        findHanoiMoves(numberOfDisks-1,rodMid,rodFrom,rodTo);
       // System.out.println("Moving Disc" +numberOfDisks + "from "+rodMid+"to "+rodTo);

    }


    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi =new TowerOfHanoi();
        towerOfHanoi.findHanoiMoves(3,'A','B','C');

    }
}
