class Dice {
    #roll() {
        return Math.floor(Math.random() * 6 + 1)
    }
    getValue() {
        return this.#roll()
    }

}
class DiceController {
    #rootElement
    #dice

    constructor(selector) {
        this.#dice = new Dice()
        this.#rootElement = document.getElementById(selector)
        const diceButton = this.#rootElement.querySelector('[data-dicebutton]')
        diceButton.addEventListener('click',this.#rollDice.bind(this))
    }
    #rollDice() {
        const diceOutputElement = this.#rootElement.querySelector('[data-diceoutput]')
        diceOutputElement.innerText=this.#dice.getValue()
    }
}
new DiceController('root')