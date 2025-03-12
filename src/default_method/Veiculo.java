package default_method;

public interface Veiculo {

    void acelerar();

    default void buzinar(){
        System.out.println("Buzina: BEEP BEEP!");
    }

}
