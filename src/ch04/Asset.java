/***
 * Excerpted from "Functional Programming in Java", published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 ***/
package ch04;

public class Asset {
    public enum AssetType {
        BOND, STOCK
    };

    public final AssetType type;
    public final int value;

    public Asset( AssetType type, int value ) {
        this.type = type;
        this.value = value;
    }
}
