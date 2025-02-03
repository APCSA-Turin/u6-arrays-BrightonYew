public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }
    /*  Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold() {
      int sum = 0;
      int lowestValue = 0;
      int highestValue = 0;
      for (int i = 0; i < itemsSold.length; i++) {
          sum += itemsSold[i];
          if (itemsSold[i] < lowestValue) {
              lowestValue = itemsSold[i];
          }
          if (itemsSold[i] > highestValue) {
              lowestValue = itemsSold[i];
          }
      }
      sum -= lowestValue + highestValue;
      return (double) sum / (itemsSold.length - 2);
  }
  
   
    /* Computes employee wages as described in part (b) and stores
       them in wages. The parameter fixedWage represents the fixed
       amount each employee is paid per day. The parameter
       perItemWage represents the amount each employee is paid per
       item sold.
     */
    public void computeWages(double fixedWage, double perItemWage) {
      double calcWage = 0;
      for (int i = 0; i < wages.length; i++) {
          calcWage = fixedWage + itemsSold[i] * perItemWage;
          if (itemsSold[i] > computeBonusThreshold()) {
              calcWage = calcWage * 1.1;
          }
          wages[i] = calcWage;
      }
    
  }
  public double[] getWages() {
    return wages;
}

  
  }
  
  
  