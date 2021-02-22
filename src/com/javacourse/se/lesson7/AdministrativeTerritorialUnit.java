package com.javacourse.se.lesson7;

import java.util.Arrays;
import java.util.Objects;

public class AdministrativeTerritorialUnit {
    protected String name;
    protected String capital;
    protected double square;
    protected AdministrativeTerritorialUnit[] parts;

    public AdministrativeTerritorialUnit(String name, double square) {
        this.name = name;
        this.square = square;
    }

    public AdministrativeTerritorialUnit(String name, String capital, double square) {
        this.name = name;
        this.capital = capital;
        this.square = square;
    }

    public AdministrativeTerritorialUnit(String name, String capital, double square, AdministrativeTerritorialUnit[] parts) {
        this.name = name;
        this.capital = capital;
        this.square = square;
        this.parts = parts;
    }

    public String getCapital() {
        return this.capital;
    }

    public double getSquare() {
        return this.square;
    }

    public int getCountRegions() {
        return this.parts.length;
    }

    public String[] getCapitalRegions() {
        String[] result = new String[this.parts.length];

        for (int i = 0; i < this.parts.length; i++) {
            result[i] = this.parts[i].capital;
        }
        return result;
    }

    @Override
    public String toString() {
        return "AdministrativeTerritorialUnit{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", square=" + square +
                ", parts=" + Arrays.toString(parts) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministrativeTerritorialUnit that = (AdministrativeTerritorialUnit) o;

        if (!(Double.compare(that.square, square) == 0 && name.equals(that.name) && capital.equals(that.capital) )) {
            return false;
        }
        if ((parts == null && that.parts != null) || (parts != null && that.parts == null)){
            return false;
        }

        if ( ((parts != null && that.parts != null)) && (parts.length != that.parts.length)){
            return false;
        }

        if((parts != null && that.parts != null)) {
            for (int i = 0; i < parts.length; i++) {
                boolean isEqual = false;
                for (int j = 0; j < that.parts.length; j++) {
                    if (this.parts[i].equals(that.parts[j])) {
                        isEqual = true;
                    }
                }

                if (!isEqual) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, capital, square);
        result = 31 * result + Arrays.hashCode(parts);
        return result;
    }
/*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministrativeTerritorialUnit that = (AdministrativeTerritorialUnit) o;
        return Double.compare(that.square, square) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(square);
    }*/
}
