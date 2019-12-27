package model;




import java.io.IOException;

public class HuffmanTree implements Comparable<HuffmanTree> {
    private HuffmanNode node;

    public  HuffmanTree () {}
    public HuffmanTree(char Char, int Freq)
    {
        this.node = new HuffmanNode(Char,Freq);
    }

    public HuffmanTree(HuffmanTree left, HuffmanTree right){
        node = new HuffmanNode();
        node.setLeft(left.getNode());
        node.setRight(right.getNode());
        node.setFreq(left.getNode().getFreq()+ right.getNode().getFreq());
    }

    public HuffmanTree(char Char, String code) {
        HuffmanNode root = new HuffmanNode(Char, code);
    }

    public HuffmanNode getNode() {
        return node;
    }


    public int compareTo(HuffmanTree o) {
        if (node.getFreq()<o.node.getFreq()) return 1;
        else if (node.getFreq()==o.node.getFreq()) return 0;
        else return -1;
    }
}