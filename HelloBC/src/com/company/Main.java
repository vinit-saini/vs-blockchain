package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Block> blockchain = new ArrayList<>();

        String[] transactionsSet1 = {"transaction-1", "transaction-2"};
        Block initialBlock = new Block(transactionsSet1, 0);
        System.out.println("initial block ::: " + initialBlock.getBlockHash());

        String[] transactionsSet2 = {"transaction-3", "transaction-4"};
        Block block2 = new Block(transactionsSet2, initialBlock.getBlockHash());
        System.out.println("block 2 ::: " + block2.getBlockHash());

        String[] transactionsSet3 = {"transaction-4", "transaction-5"};
        Block block3 = new Block(transactionsSet3, block2.getBlockHash());
        System.out.println("block 3 ::: " + block3.getBlockHash());

    }
}
