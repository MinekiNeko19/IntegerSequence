import java.util.NoSuchElementException;

public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    current = start;
  }

  public void reset() {
    current = start;
  }
  public int length() {
    return start-end;
  }
  
  //When current is no longer a valid element in the range, it should return false. 
  public boolean hasNext() {
    if (current <= end) {
        return true;
    }
    return false;
  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1. 
  //e.g.  if current is 5. This will make current 6, and return 5. 
  public int next() {
    if (this.hasNext()) {
        int pop = current;
        current++;
        return pop;
    } else {
        throw new NoSuchElementException();
    }
  }
  
  public static void main(String[] args) {
      Range a = new Range(20,40);

      // Testing constructor
      System.out.println(a.start);
      System.out.println(a.end);
      System.out.println(a.current);

      // Testing next
      try {
        System.out.println(a.next());
        for (int i = 0; i < 21; i++) {
            System.out.println(a.next());
        }
      } catch (NoSuchElementException e) {
        System.out.println("Out of range. Reset.");
      }
    }
  }