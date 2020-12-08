import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
    private int currentIndex;
    private int []data;

    /*Construct the sequence by copying values from the other array into the data array*/
    public ArraySequence(int [] other){
        data = new int[other.length];
        for (int i = 0; i < other.length; i++) {
            data[i] = other[i];
        }
        currentIndex = 0;
    }

    //Postcondition: The otherseq will be reset.
    //This constructor will copy ALL values of the `otherseq` into the data array.
    public ArraySequence(IntegerSequence otherseq){  }

    public boolean hasNext() {
        if (data.length == currentIndex) return false;
        return true;
    }

    public int next() {
        currentIndex++;
        return data[currentIndex-1];
    }

    public int length() {
        return 0;
    }

    public void reset() {

    }

    public static void main(String[] args) {
        // Demo 1
        int[]nums = {1,3,5,0,-1,3,9};
        IntegerSequence as = new ArraySequence(nums);

        System.out.println("ArraySequence(array):");
        while(as.hasNext()){
            System.out.print(as.next()+", ");
        }

        // Demo 2
        // IntegerSequence r = new Range(10,20);
        // IntegerSequence as = new ArraySequence(r);
    
        // System.out.println("ArraySequence(seq):");
        // while(as.hasNext()){
        //     System.out.print(as.next()+", ");
        // }
        // System.out.println();
    }
}
