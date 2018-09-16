package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by vsaini on 3/22/18.
 */
public class Block {

    private String[] transactions;
    private long previousBlockHash;

    private long hash;

    public Block(String[] transactions, long previousBlockHash) {
        this.transactions = transactions;
        this.previousBlockHash = previousBlockHash;

        Object[] blockContents = {Arrays.hashCode(transactions), previousBlockHash};
        hash = Arrays.hashCode(blockContents);
    }

    public long getPreviousHash() {
        return this.previousBlockHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public long getBlockHash() {
        return hash;
    }
}
