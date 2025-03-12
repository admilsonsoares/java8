package data_hora_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DataHoraFacade {

    LocalDate hoje;  // Obtém a data atual
    LocalTime agora;
    LocalDateTime dataHoraAtual;
    LocalDate dataEspecifica;
    LocalTime horaEspecifica;
    LocalDateTime dataHoraEspecifica;
    LocalDate proximoAno;
    LocalDate mesPassado;
    LocalDate data1;
    LocalDate data2;
    Period periodo;
    LocalTime inicio;
    LocalTime fim;
    Duration duracao;
    DateTimeFormatter formatter;
    String dataFormatada;
    ZonedDateTime agoraZoned;
    ZonedDateTime agoraSP;
    ZonedDateTime agoraNY;
    ZonedDateTime agoraTokyo;
    // Definindo como horário de São Paulo
    ZonedDateTime spTime;
    // Convertendo para horário de Londres
    ZonedDateTime londonTime;
    Set<String> fusos;
    Duration diferenca;
    DateTimeFormatter formatterZoned;




    public DataHoraFacade() {
        this.hoje = LocalDate.now();
        this.agora = LocalTime.now();
        this.dataHoraAtual = LocalDateTime.now();
        this.dataEspecifica = LocalDate.of(2023, 12, 25);
        this.horaEspecifica = LocalTime.of(14, 30);
        this.dataHoraEspecifica = LocalDateTime.of(2023, 12, 25, 14, 30);
        this.proximoAno = hoje.plusYears(1);  // Adiciona 1 ano
        this.mesPassado = hoje.minusMonths(1); // Remove 1 mês

        this.data1 = LocalDate.of(2023, 5, 10);
        this.data2 = LocalDate.of(2025, 3, 11);
        this.periodo = Period.between(data1, data2);

        this.inicio = LocalTime.of(14, 0);
        this.fim = LocalTime.of(16, 30);
        this.duracao = Duration.between(inicio, fim);

        this.formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.dataFormatada = dataHoraAtual.format(formatter);

        this.agoraZoned = ZonedDateTime.now();
        this.agoraSP = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        this.agoraNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        this.agoraTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        this.spTime = dataHoraAtual.atZone(ZoneId.of("America/Sao_Paulo"));
        this.londonTime = spTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        this.fusos = ZoneId.getAvailableZoneIds();
        this.diferenca = Duration.between(agoraSP, agoraTokyo);
        this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");



    }

    public void printExemplos(){
        System.out.println("Data atual: " + hoje);
        System.out.println("horario atual: " + agora);
        System.out.println("data e horas juntas: " + dataHoraAtual);
        System.out.println("Data específica: " + dataEspecifica);
        System.out.println("Hora específica: " + horaEspecifica);
        System.out.println("Data e Hora específica: " + dataHoraEspecifica);
        System.out.println("Próximo ano: " + proximoAno);
        System.out.println("Mês passado: " + mesPassado);
        System.out.println("Diferença: " + periodo.getYears() + " anos, "
                + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
        System.out.println("Duração: " + duracao.toHours() + " horas e "
                + duracao.toMinutes() + " minutos.");
        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Data e Hora atual com fuso horário: " + agora);
        System.out.println("São Paulo: " + agoraSP);
        System.out.println("Nova York: " + agoraNY);
        System.out.println("Tóquio: " + agoraTokyo);
        System.out.println("São Paulo atual: " + spTime);
        System.out.println("Londres atual: " + londonTime);

        fusos.stream()
                .sorted()
                .limit(10)  // Mostra apenas os 10 primeiros para não poluir a saída
                .forEach(System.out::println);

        System.out.println("Diferença entre São Paulo e Tóquio: " + diferenca.toHours() + " horas");
        System.out.println("Data formatada: " + agora.format(formatter));



    }
}
