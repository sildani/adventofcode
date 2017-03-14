package com.silvanolte.adventofcode

import org.junit.Test

class LibraryTest {

  @Test
  void should_add_two_numbers() {
    Library library = new Library()
    def tests = [
      [1, 1, 2],
      [1, 3, 4],
      [2, 1, 3],
      [5, 6, 11],
    ]
    tests.each { test ->
      assert library.add(test[0], test[1]) == test[2]
    }
  }
}
