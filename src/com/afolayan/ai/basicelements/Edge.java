package com.afolayan.ai.basicelements;

/**
 * @author Niclas Hofmann
 */
public class Edge {
    private Node start;
    private Node end;
    private double realCosts;

    public Edge(Node start, Node end, double realCosts) {
        this.start = start;
        this.end = end;
        this.realCosts = realCosts;
    }

    public double getRealCosts() {
        return this.realCosts;
    }

    public Node getStart() {
        return this.start;
    }

    public Node getEnd() {
        return this.end;
    }

    public Node getNeightbor(Node n) {
        if (n == start)
            return end;
        else
            return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public void setRealCosts(double realCosts) {
        this.realCosts = realCosts;
    }
}
