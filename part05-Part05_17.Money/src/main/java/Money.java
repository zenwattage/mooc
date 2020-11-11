
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        
        int tempCents = cents + addition.cents();
        int tempEuros = euros + addition.euros();
        
        if(tempCents > 100){
            tempEuros++;
            tempCents -= 100;
        }
        return new Money(tempEuros, tempCents);
    }
    
    public Money minus(Money decreaser){
        
        int tempCents = cents - decreaser.cents();
        int tempEuros = euros - decreaser.euros();
        
        if(tempCents < 0 ){
            tempEuros--;
            tempCents += 100;
        }
        
        Money tempValue = new Money(tempEuros, tempCents);
        Money zero = new Money(0,0);
        
        if(tempValue.lessThan(zero)){
            return zero;
        } else {
            return tempValue;
        }
        
    }
    
    
    
    public boolean lessThan(Money compared){
        
        if(euros < compared.euros()){
            return true;
        }
        
        if(euros > compared.euros()){
            return false;
        }
        
        if(cents < compared.cents()){
            return true;
        }
        
        return false;
    }
    
    
    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
