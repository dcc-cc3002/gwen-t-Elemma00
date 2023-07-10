package cl.uchile.dcc
package gwent.controller

class State {
  protected def changeState(controller: Controller, state: State): Unit = {
    controller.setState(state)
  }

  def error() = throw new AssertionError("Estado Equivocado")
  def setPlayersAndTable(controller: Controller): Unit = error()
  def chooseFirstPlayer(controller: Controller): Unit = error()
  def changePlayer(controller: Controller):Unit = error()
  def setHands(controller: Controller): Unit = error()
  def playCard(controller: Controller): Unit = error()
  def pass(controller: Controller): Unit = error()
  def nextTurn(controller: Controller): Unit = error()
  def drawCards(controller: Controller): Unit = error()
  def hasPassed(controller: Controller): Unit = error()
  def nextRound(controller: Controller): Unit = error()
  def endRound(controller: Controller): Unit = error()
  def winner(controller: Controller): Unit = error()


  def isStartGame():Boolean = false
  def isChoosingFirstPlayer():Boolean =  false
  def isFirstRound():Boolean = false
  def isWaitingAction():Boolean = false
  def isStartRound():Boolean = false
  def isTurnsHandler():Boolean = false
  def isNextPlayerTurn():Boolean = false
  def isNextPlayerTurnNoLimits():Boolean = false
  def isWaitingActionWithPass():Boolean =  false
  def isRoundDecision():Boolean = false
  def isEndGame():Boolean = false
  
  


}
