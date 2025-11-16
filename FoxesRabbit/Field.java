package FoxesRabbit;

import java.util.List;
import java.util.ArrayList;

public class Field {
    private Object[][] field;

    public Field(int depth, int width) {
        field = new Object[depth][width];
    }

    public void clear(Location location) {
        field[location.getRow()][location.getCol()] = null;
    }

    public void place(Object obj, Location location) {
        field[location.getRow()][location.getCol()] = obj;
    }

    public Object getObjectAt(Location location) {
        return field[location.getRow()][location.getCol()];
    }

    public Location freeAdjacentLocation(Location location) {
        List<Location> free = new ArrayList<>();
        for (Location loc : adjacentLocations(location)) {
            if (getObjectAt(loc) == null) {
                free.add(loc);
            }
        }
        
        return free.isEmpty() ? null : free.get(0);
    }
    public int getDepth() {
        return field.length;
    }

    public int getWidth() {
        return field[0].length;
    }

    public List<Location> adjacentLocations(Location location) {
        List<Location> locations = new ArrayList<>();
        int row = location.getRow();
        int col = location.getCol();

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue;
                int newRow = row + dr;
                int newCol = col + dc;
                if (newRow >= 0 && newRow < field.length && newCol >= 0 && newCol < field[0].length) {
                    locations.add(new Location(newRow, newCol));
                }
            }
        }
        return locations;
    }

    public void printField() {
        for (int r = 0; r < getDepth(); r++) {
            for (int c = 0; c < getWidth(); c++) {
                Object obj = field[r][c];
                if (obj instanceof Rabbit) {
                    System.out.print("R ");
                } else if (obj instanceof Fox) {
                    System.out.print("F ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
    
}
