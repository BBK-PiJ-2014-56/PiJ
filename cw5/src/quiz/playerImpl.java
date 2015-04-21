package quiz;

/**
 * Created by jimjohn_thornton on 19/04/15.
 */
public class playerImpl implements player {

    private String playerName;

    public playerImpl(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String getPlayerName() {
        return this.playerName;
    }
}
