package syntax;

public class MultilineTextBlocks {

        public static void demo() {
            System.out.println(java8());
            System.out.println(java14preview());
        }

        private static String java8() {
            return "<html>\n" +
                    "    <body>\n" +
                    "        <p>TEST</p>\n" +
                    "    </body>\n" +
                    "</html>\n";
        }

        private static String java14preview() {
            return """
              <html>
                  <body>
                      <p>TEST>
                  </body>
              </html>
              """;
        }

}
