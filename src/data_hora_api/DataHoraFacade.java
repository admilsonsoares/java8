package data_hora_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataHoraFacade {

    LocalDate dataEspecifica;
    LocalTime horaEspecifica;
    LocalDateTime dataHoraEspecifica;

    public DataHoraFacade() {
        this.dataEspecifica = LocalDate.of(2023, 12, 25);
        this.horaEspecifica = LocalTime.of(14, 30);
        this.dataHoraEspecifica = LocalDateTime.of(2023, 12, 25, 14, 30);;
    }

    public void printExemplos(){
        System.out.println("Data específica: " + dataEspecifica);
        System.out.println("Hora específica: " + horaEspecifica);
        System.out.println("Data e Hora específica: " + dataHoraEspecifica);
    }
}
