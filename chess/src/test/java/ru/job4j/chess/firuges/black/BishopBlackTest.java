package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bp = new BishopBlack(Cell.B2);
        Cell stands = bp.position();
        Cell expected = Cell.B2;
        assertEquals(expected, stands);
    }

    @Test
    public void way() {
        BishopBlack bp = new BishopBlack(Cell.C1);
        Cell[] move = bp.way(Cell.G5);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(move, expected);
    }

    @Test
    public void isDiagonal() {
        BishopBlack bp = new BishopBlack(Cell.D4);
        Cell dest = bp.copy(Cell.F6).position();
        assertTrue(bp.isDiagonal(Cell.D4, dest));
    }

    @Test
    public void isNotDiagonal() {
        BishopBlack bp = new BishopBlack(Cell.D4);
        Cell dest = bp.copy(Cell.G4).position();
        assertFalse(bp.isDiagonal(Cell.D4, dest));
    }

    @Test
    public void copy() {
        BishopBlack bp = new BishopBlack(Cell.B2);
        Cell stands = bp.copy(Cell.D4).position();
        Cell expected = Cell.D4;
        assertEquals(stands, expected);
    }
}