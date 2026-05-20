import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RelogioDigital extends Application {

    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void start(Stage janela) {
        Label rotuloTempo = new Label();
        rotuloTempo.setStyle("-fx-font-size: 24px; -fx-text-fill: yellow;");

        // Atualiza o rotulo com a hora atual assim que a timeline inicia.
        KeyFrame keyFrameAtualizar = new KeyFrame(Duration.ZERO, evento -> {
            rotuloTempo.setText(LocalDateTime.now().format(FORMATADOR));
        });

        // Define o intervalo de atualizacao do relogio.
        KeyFrame keyFrameIntervalo = new KeyFrame(Duration.seconds(1));

        Timeline relogio = new Timeline();
        relogio.getKeyFrames().addAll(keyFrameAtualizar, keyFrameIntervalo);
        relogio.setCycleCount(Timeline.INDEFINITE);
        relogio.play();

        VBox layout = new VBox(rotuloTempo);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: black;");

        Scene cena = new Scene(layout, 800, 600);

        janela.setScene(cena);
        janela.setTitle("Relogio Digital");
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
