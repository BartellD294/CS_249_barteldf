package edu.realemj.exercises13;

import java.util.*;
import java.io.*;
import edu.realemj.exercises09.Matrix;

public class OBJModel {
    private ArrayList<Matrix> vertices = new ArrayList<>();
    private ArrayList<Face> faces = new ArrayList<>();

    private String getVertString(Matrix v) {
        return "v " + v.get(0,0) +
                " " + v.get(1, 0) +
                " " + v.get(2, 0);
    }

    public void save(String filename) throws IOException {
        try (
                PrintWriter output = new PrintWriter(filename);
                ) {
            for(Matrix v: vertices) {
                output.println(getVertString(v));
            }
            for(Face f: faces) {
                output.println(f);
            }
        }
    }

}
