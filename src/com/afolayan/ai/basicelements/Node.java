package com.afolayan.ai.basicelements;

import java.util.LinkedList;
import java.util.List;


public class Node {
    private double x;
    private double y;
    private double gScore; //costs to this node
    private double hScore; //estimated costs to destination
    private double fScore; //f = g + h
    private List<Edge> edges;
    private Node previousNode;
    private String name;

    public Node(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.previousNode = null;
        this.gScore = 0.0;
        this.hScore = 0.0;
        this.fScore = 0.0;
        this.edges = new LinkedList<>();
    }

    public double getRealCosts() {
        return this.gScore;
    }

    public double getTotalCosts() {
        return this.fScore;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public List<Edge> getEdges() {
        return this.edges;
    }

    public Node getPrevious() {
        return this.previousNode;
    }

    public String getName() {
        return this.name;
    }

    public void addToEdgeList(Edge edge) {
        this.edges.add(edge);
    }

    public void setCostsToThisNode(double g) {
        this.gScore = g;
        updateTotalCosts();
    }

    public void setEstimatedCostsToDestination(double h) {
        this.hScore = h;
        updateTotalCosts();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    private void updateTotalCosts() {
        this.fScore = this.gScore + this.hScore;
    }
}
