class Dice {

  #roll() {
    return Math.floor(Math.random() * 6) + 1;
  }

  getValue() {
    return this.#roll();
  }

}

class DiceController {

  #dice;
  #rootElement;
  #button;
  #output;

  constructor(selector) {
    this.#dice = new Dice();
    this.#rootElement = document.querySelector(selector);
    this.#button = this.#rootElement.querySelector("*[data-dicebutton]");
    this.#button.addEventListener("click", this.#rollDice.bind(this));
    this.#output = this.#rootElement.querySelector("*[data-diceoutput]");
  }

  #rollDice() {
    const value = this.#dice.getValue();
    this.#output.innerText = value;
  }

}

(new DiceController('#root'));
