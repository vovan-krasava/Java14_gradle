package syntax;

public class MultilineTextBlocks {

        public static void demo() {
            System.out.println(java8);
            System.out.println(java14preview);

        }

        private static String java8 = "<html>\n" +
                    "    <body>\n" +
                    "        <p>TEST</p>\n" +
                    "    </body>\n" +
                    "</html>\n";


        private static String java14preview = """
              <html>
                  <body>
                      <p>TEST</p>
                  </body>
              </html>
              """;

    private  static String java8_ = "This is major Tom to Ground Control " +
            "I am stepping through the door... " +
            "Wait… What???";

    private static String java14_line_terminator = """
                This is major Tom to Ground Control \
                I am stepping through the door... \
                Wait… What???\
                """;

    private static String java8_new_line = "line1\nline2 \nline3\n";

    private static String java14_single_space = """
               line1
               line2 \s
               line3
               """;

}
