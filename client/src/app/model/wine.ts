import { ingredient } from './ingredient';
import { meat } from './meat';
import { sauce } from './sauce';
export class wine{
    id?: number;
    name: string;
    year: number;
    color: string;
    wineSugar: string;
    sauceList: sauce[];
    meatList: meat[];
    ingredients: ingredient[];

}