package cs345.deadwood.model;

import java.util.List;

/**
 * Interface representing a basic set on the board. Every set on the board should implement this interface.
 */
public interface ISet {

    /**
     * @return Name of the set
     */
    String getName();

    /**
     * @return List of neighbors of this set
     */
    List<ISet> getNeighbors();

    /**
     * @return Area of this set
     */
    IArea getArea();

    /**
     * @return List of blank areas on this set.
     */
    List<BlankArea> getBlankAreas();
}
