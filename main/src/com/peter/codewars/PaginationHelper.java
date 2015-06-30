package com.peter.codewars;

/**
 * PaginationHelper
 * http://www.codewars.com/kata/515bb423de843ea99400000a/train/java
 */

import java.util.List;

public class PaginationHelper<I> {
    private final List<I> collection;
    private final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return this.collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (this.itemsPerPage == 0 || this.collection.size() == 0) {
            return 0;
        }

        return this.collection.size() / this.itemsPerPage + 1;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex >= this.pageCount()) {
            return -1;
        }

        if (pageIndex < this.pageCount() - 1) {
            return this.itemsPerPage;
        }

        return this.collection.size() - this.itemsPerPage * pageIndex;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex >= this.collection.size() || itemIndex < 0) {
            return -1;
        }

        return itemIndex / this.itemsPerPage;
    }
}