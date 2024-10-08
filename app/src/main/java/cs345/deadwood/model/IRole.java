package cs345.deadwood.model;

import cs345.deadwood.view.RoleView;

public interface IRole {

    /**
     * @return Name of the role
     */
    String getName();

    /**
     * @return Level of the role
     */
    int getLevel();

    /**
     * @return Line of the role
     */
    String getLine();

    /**
     * @return Area of the role
     */
    IArea getArea();

    void setObserver(RoleView roleView);
}
