package game;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Board {
    private final Game.Player[] cells;

    public Board() {
        this(IntStream.range(0, 9).mapToObj(i -> null)
                .collect(Collectors.toList()).toArray(new Game.Player[0]));
    }

    public Board(Game.Player[] cells) {
        this.cells = cells;
    }

    public Game.Player getCell(int x, int y) {
        return this.cells[y * 3 + x];
    }

    public Board updateCell(int x, int y, Game.Player player) {
        Game.Player[] newCells = Arrays.copyOf(this.cells, this.cells.length);
        newCells[y * 3 + x] = player;
        return new Board(newCells);
    }
}
