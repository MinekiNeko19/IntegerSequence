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
    public ArraySequence(IntegerSequence otherseq){
        data = new int[otherseq.length()+1];
        int count = 0;
        while (otherseq.hasNext()) {
            System.out.println(otherseq.hasNext());
            try {
                data[count] = otherseq.next();
                count++;
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                System.out.println("No element here. Set to 0");
            }
        }
        currentIndex = 0;
        otherseq.reset();
        
    }

    public boolean hasNext() {
        return !(data.length==currentIndex);
    }

    public int next() {
        if (this.hasNext()) {
            currentIndex++;
            return data[currentIndex-1];
        } else {
            throw new NoSuchElementException();
        }
    }

    public int length() {
        return data.length;
    }

    public void reset() {
        currentIndex = 0;
    }

    public static void main(String[] args) {
        // Demo 1
        // int[]nums = {1,3,5,0,-1,3,9};
        // IntegerSequence as = new ArraySequence(nums);

        // System.out.println("ArraySequence(array):");
        // while(as.hasNext()){
        //     System.out.print(as.next()+", ");
        // }

        // Demo 2
        // IntegerSequence r = new Range(10,20);
        // IntegerSequence as = new ArraySequence(r);
    
        // System.out.println("ArraySequence(seq):");
        // while(as.hasNext()){
        //     System.out.print(as.next()+", ");
        // }
        // System.out.println();

        // Checking ArraySequence(ArraySequence)
        // int[] range = new int[10];
        // for (int i = 0; i < range.length; i++) {
        //     range[i] = i*2;
        // }
        // ArraySequence a = new ArraySequence(range);
        // System.out.println(a.length());
        // ArraySequence b = new ArraySequence(a);
        // System.out.println(b.length());
        // for (int i = 0; i < 15; i++) {
        //     try {
        //         System.out.print(b.currentIndex + " ");
        //         System.out.println(b.next());
        //     } catch (NoSuchElementException e) {
        //         e.printStackTrace();
        //         System.out.println("No more elements in the sequence. Reset to use.");
        //         // System.out.println("Resetting for you.")
        //         // b.reset();
            // }
        // }

        // Range r = new Range(2,10);
        // ArraySequence a = new ArraySequence(r);
    }
}
