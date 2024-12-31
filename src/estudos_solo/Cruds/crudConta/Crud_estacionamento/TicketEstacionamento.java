package estudos_solo.Cruds.crudConta.Crud_estacionamento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TicketEstacionamento {
    private UUID idTicket;
    private LocalDateTime dataDeEntrada;
    private LocalDateTime dataDeSaida;
    private int tempoEstacionado;

    // Formatter para exibir datas no formato desejado
    private static final DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("HH");

    public TicketEstacionamento() {
        this.idTicket = UUID.randomUUID();
        this.dataDeEntrada = LocalDateTime.now();
    }

    public UUID getIdTicket() {
        return idTicket;
    }

    public LocalDateTime getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeSaida() {
        this.dataDeSaida = LocalDateTime.now(); // Define a data de saída como o momento atual
    }

    public LocalDateTime getDataDeSaida() {
        return dataDeSaida;
    }

    public String getDataDeEntradaFormatada() {
        return dataDeEntrada.format(dataFormato);
    }

    public String getDataDeSaidaFormatada() {
        return dataDeSaida != null ? dataDeSaida.format(dataFormato) : "Ainda estacionado";
    }

    public void exibirTicketECarro() {
        System.out.println("ID do Ticket: " + idTicket);
        System.out.println("Entrada: " + getDataDeEntradaFormatada());
        System.out.println("Saída: " + getDataDeSaidaFormatada());
    }

    public void retiradaDeVeiculo() {
        setDataDeSaida();
        System.out.println("Veiculo removido com sucesso");
        System.out.println("Hora da entrada: " + getDataDeEntradaFormatada());
        System.out.println("Hora da saída: " + getDataDeSaidaFormatada());

        int dataEntrada = Integer.parseInt(getDataDeEntradaFormatada());
        int dataSaida = Integer.parseInt(getDataDeSaidaFormatada());

        int horasEstacionado = dataSaida - dataEntrada;

        if(horasEstacionado < 1) {
            System.out.println("Você pode sair de graça por estar dentro do limite de tempo: 1 hora");
        } else {
            int valorAPagar = horasEstacionado * 5;
            System.out.println("Você deve:R$ " + valorAPagar + " por ficar estacionado por: " + horasEstacionado + " Horas");

        }
    }
}

