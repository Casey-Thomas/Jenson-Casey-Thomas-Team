/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Wayne Thomas
 */
public class Scene implements Serializable {

    private String description;
    private String mapSymbol;
    public String name;
    private int distanceFromNauvoo;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    public void setMapSymbol(String st) {
        mapSymbol = st;

    }

    public void setDistanceFromNauvoo(int i) {
        distanceFromNauvoo = i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public String getName() {
        return name;
    }

    public int getDistanceFromNauvoo() {
        return distanceFromNauvoo;
    }

    public Object createScenes() {
        Object scenes = null;
        return scenes;
    }

}
