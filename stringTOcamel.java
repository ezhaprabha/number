public static String convertToNameCase(String s)
    {
        if (s != null)
        {
            StringBuilder b = new StringBuilder();
            String[] split = s.split(" ");
            for (String srt : split)
            {
                if (srt.length() > 0)
                {
                    b.append(srt.substring(0, 1).toUpperCase()).append(srt.substring(1).toLowerCase()).append(" ");
                }
            }
            return b.toString().trim();
        }
        return s;
    }