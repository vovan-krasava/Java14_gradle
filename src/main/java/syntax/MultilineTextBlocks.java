package syntax;

public class MultilineTextBlocks {

        public static void demo() {
            System.out.println(jdk8());
            System.out.println(jdk14preview());
        }

        private static String jdk8() {
            return "<html>\n" +
                    "    <body>\n" +
                    "        <p>TEST</p>\n" +
                    "    </body>\n" +
                    "</html>\n";
        }

        private static String jdk14preview() {
            return """
              <html>
                  <body>
                      <p>TEST>
                  </body>
              </html>
              """;
        }

}
