package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    public String adverb;
    public String edVerb;
    public String bodyPart;
  }
  public static void main(String[] args)
  {
    Words word = new Words();
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    word.adverb = MessageBox.askForTextInput("Enter an adverb");
    word.edVerb = MessageBox.askForTextInput("Enter an adverb that ends in ed.");
    word.bodyPart = MessageBox.askForTextInput("Enter a body part");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#3
    //  Ask the user to enter a body part, save it as currentBodyPart --#4
    String currentStory = Parser.parseRtfFile("view.rtf", word);
    Viewer.displayRtfFile(currentStory);
  }
}